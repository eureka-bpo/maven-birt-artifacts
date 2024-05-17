import org.eclipse.birt.report.engine.api.*;

import java.util.logging.Level;

import org.eclipse.birt.core.exception.BirtException;
import org.eclipse.birt.core.framework.Platform;

public class Test {
	public static void main(String[] args) throws BirtException {
		EngineConfig config = new EngineConfig();
		config.setLogConfig(null, Level.FINEST);

		Platform.startup(config);
		IReportEngineFactory factory = (IReportEngineFactory) Platform
			.createFactoryObject(IReportEngineFactory.EXTENSION_REPORT_ENGINE_FACTORY);
		IReportEngine birtEngine = factory.createReportEngine(config);
		IReportRunnable report = birtEngine.openReportDesign(Test.class.getResourceAsStream("/basic.rptdesign"));
		IRunAndRenderTask runAndRenderTask = birtEngine.createRunAndRenderTask(report);
		IRenderOption options = new RenderOption();
		PDFRenderOption pdfOptions = new PDFRenderOption(options);
		pdfOptions.setOutputFormat(IRenderOption.OUTPUT_FORMAT_PDF);
		pdfOptions.setOutputFileName("basic-pdf.pdf");
		runAndRenderTask.setRenderOption(pdfOptions);
		
		runAndRenderTask.setParameterValue("paramString", "my parameter");
		runAndRenderTask.setParameterValue("paramInteger", 2);
		runAndRenderTask.setParameterValue("paramList", 2);
		runAndRenderTask.run();
		
		runAndRenderTask.close();
		birtEngine.destroy();
		
		System.out.println("Report generation successfully finished");
	}
}

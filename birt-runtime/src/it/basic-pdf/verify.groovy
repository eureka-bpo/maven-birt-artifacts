def buildPdf = new File( basedir, 'basic-pdf.pdf' )
assert buildPdf.exists()

def buildLog = new File( basedir, 'build.log' )
assert buildLog.text.contains('Report generation successfully finished')

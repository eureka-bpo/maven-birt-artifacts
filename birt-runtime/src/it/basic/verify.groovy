def buildLog = new File( basedir, 'build.log' )
assert buildLog.text.contains('<div>my parameter</div>')
assert buildLog.text.contains('Report generation successfully finished')

def buildLog = new File( basedir, 'build.log' )
assert buildLog.text.contains('Tests run: 191, Failures: 0, Errors: 3, Skipped: 0')

def call(String scriptName) {
  def scriptPath = "${libraryResource('my-shared-library/resources')}/${scriptName}"
  bat "powershell -File ${scriptPath}"
}

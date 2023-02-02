def call(String scriptName) {
  def scriptPath = "${libraryResource('my-shared-library/resources/script/windows')}/${scriptName}"
  bat "powershell -File ${scriptPath}"
}

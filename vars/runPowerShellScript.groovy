def call(String scriptName) {
  def scriptPath = "${libraryResource('experiment/resources/script/windows')}/${scriptName}"
  bat "powershell -File ${scriptPath}"
}

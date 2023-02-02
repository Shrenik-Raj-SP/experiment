def call(String scriptName) {
  def scriptPath = "${libraryResource('resources/script/windows')}/${scriptName}"
  bat "powershell -File ${scriptPath}"
}

def call(String scriptName) {
  def scriptPath = "${libraryResource('script/windows')}/${scriptName}"
  bat "powershell -File ${scriptPath}"
}

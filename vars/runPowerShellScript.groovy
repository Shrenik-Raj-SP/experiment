def call(String scriptName) {
  //def scriptPath = "${libraryResource('script/windows')}/${scriptName}"
  //def scriptPath = libraryResource "script/windows/${scriptName}"
  def scriptPath = libraryResource "script/windows/hello.ps1"
  bat "powershell -File ${scriptPath}"
}

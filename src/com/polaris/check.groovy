package com.polaris

public class check {

  def buildIsUatApproved() {
    def file = new File("C:/approved.txt")
    
    if (file.exists()){
      return true;
    }
    else {
      println "Approval file does not exist."
    }
    
    return false;
  }

}

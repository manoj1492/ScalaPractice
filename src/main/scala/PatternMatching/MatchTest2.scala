package PatternMatching

import CaseClass.{Email, Notification, SMS, VoiceRecording}
/**
  * Created by manojma on 5/11/2017.
  */
class MatchTest2 {

  def showNotiication(notification: Notification): String ={
    notification match{
      case Email(email, title, _) =>
        "You got an email from "+email+" with title "+title
      case SMS (number, message) =>
        "You got a SMS from "+number+" with message "+message
      case VoiceRecording(contactName,link) =>
        "You recieved a voice recording from "+contactName + " and you can hear it by clicking the following link: " +link


    }
  }
}

package PatternMatching

import CaseClass.{SMS, VoiceRecording}

/**
  * Created by manojma on 5/11/2017.
  */
object message extends App{

  val someSMS = SMS("4578", "Hi there")
  val someVoiceRecording = VoiceRecording("Manoj", "http://lissten.com")

  val matchTest  = new MatchTest2

  println(matchTest.showNotiication(someSMS))
  println(matchTest.showNotiication(someVoiceRecording))
}

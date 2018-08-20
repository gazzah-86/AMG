WinWaitActive("","Authentication Required","10")
WinFlash("", "Authentication Required",4,500)
If WinExists("","Authentication Required") Then
  Send("client.uat{TAB}")
  Send("He4thw4ll4ce{Enter}")
ElseIf WinExists("","Chrome Legacy Window")Then
  Send("client.uat{TAB}")
  Send("He4thw4ll4ce{Enter}")
ElseIf WinExists("","Windows Security") Then
  Send("client.uat{TAB}")
  Send("He4thw4ll4ce{Enter}")
EndIf
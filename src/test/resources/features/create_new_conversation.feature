Feature:create function
 user story : As an application basic user, I should be able to create a new group conversation so that I can communicate with other users.

AC:
	Display all conversation lists under the Talk module

	User can create a new conversation under the Talk module

  @CLOUD-1761
  Scenario: Talk functionality(Create new conversation nurbiye)
    Given the user navigate to the url
    When  the user click talk button
    And   user select " create new group conversation"
    And   User type the name of the conversation under 'Name'.
    And   User select"allow guest to join via link"
    And   User select"Password protect"
    And   User select on "add participant"
    Then  User should see new created  "Nurbiye" in conversation.


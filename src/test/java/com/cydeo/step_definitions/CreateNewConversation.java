package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewConversation {

    @Given("the user navigate to the url")
    public void the_user_navigate_to_the_url() {
        System.out.println("It is from Given");
    }

    @When("the user click talk button")
    public void the_user_click_talk_button() {
        System.out.println("It is from when");
    }

    @And("user select {string}")
    public void user_select(String string) {
        System.out.println("It is from And");
    }

    @And("User type the name of the conversation under {string}.")
    public void user_type_the_name_of_the_conversation_under(String string) {
        System.out.println("It is from And");
    }

    @And("User select\"allow guest to join via link\"")
    public void user_select_allow_guest_to_join_via_link() {
        System.out.println("It is from And");
    }

    @And("User select\"Password protect\"")
    public void user_select_password_protect() {
        System.out.println("It is from And");
    }

    @And("User select on {string}")
    public void user_select_on(String string) {
        System.out.println("It is from And");
    }

    @Then("User should see new created  {string} in conversation.")
    public void user_should_see_new_created_in_conversation(String string) {
        System.out.println("It is from Then");
    }

}

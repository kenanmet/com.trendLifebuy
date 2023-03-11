
Feature:[US033] As an administrator, I want a page on the site where I can see all
                active and inactive customers together.

  Background:Common steps for all Scenarios
    Given user goes to admin login page
    Then enters valid email to mail box
    Then enters valid password to password box
    And clicks to the sign in button
    Then clicks to customer button
    Then clicks to all customer button

  Scenario:[TC001] When the All Customer button on the Dashboard Side Bar is clicked,
                   it should be verified that the All customer page can be accessed.
    And user verifies that he is on page All customer

  Scenario:[TC002] Verify that the All Customer List is visible on the All Customer page.
    And verifies that the All Customer List is visible

  Scenario:[TC003] When the radio button in the Is Active column of the All Customer List is clicked,
                   it should be verified whether the active state of the customer has changed.
    Then clicks to is active radio button
    And verifies that success toast massage is displayed

  Scenario:[TC004] Clicking the Active Customer button on the All Customer page should verify that
                   the Active customer list is visible.
    Then clicks to the active customer link
    Then verifies that the Active Customer List is visible
Feature: TM4J Test Case Creation

  Background: Login successfully with valid user name and password
    Given User successfully logs in

  Scenario Outline: Create a Test Case in ATM Server
    Given User navigates to TM4J
    And User Select the <Project>
    When User Clicks on New button
    Then the <ScreenName> is displayed
    And User Input <TestCaseName> in Name field
    And User Input <Objectives> in Objective field
    And User Input <Preconditions> in Precondition field
    And User Select <Folder> for Folder field
    And User Select <Status> for Status field
    And User Select <Priority> for Priority field
    And User Select <Owner> for Owner field
    And User Input <EstimatedTime> in Estimated Time field
    And User Clicks on Test Script tab
    And User Input <TestScriptType> For type
    And User Input <TestStep> <TestData> <ExpectedResult> For steps
    When User Clicks on Save button
    Then Test Case with <ProjectID> created

    Scenarios:
      | Project        | ScreenName       | TestCaseName     | Objectives | Preconditions | Folder           | Status   | Priority | Owner      | EstimatedTime | TestScriptType | TestStep | TestData  | ExpectedResult  | ProjectID |
      | ATM Automation | Create Test Case | Automation Test 1 | Objective1 | precondition1 | /New test folder | Approved | High     | Unassigned | 2000          | Steps          | Step1    | Testdata1 | ExpectedResult1 | ATMAA      |




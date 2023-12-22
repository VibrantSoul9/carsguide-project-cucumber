@regression
Feature: Search functionality
  @author_Jigna@smoke @Sanity
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Search Cars’ link
    Then I navigate to ‘new and used car search’ page
    And I select make “<make>”
    And I select model “<model>”
    And I select location “<location>”
    And I select price “<price>”
    And I click on Find My Next Car tab
    Then I should see the make “<make>” in results
  Examples:
  |make          |model           |location               |price      |
  | make         | model          | location              | price     |
  |Nissan        |180SX           |Any Location           |$50,000    |
  |BMW           |1 Series        |NSW-All                |$2,000     |
  |Suzuki        |Baleno          |Any Location           |$35,000    |
  |Subaru        |Sambar          |VIC-Wimmera Mallee     |$35,000    |
  |Cadillac      |Escalade        |NSW-Sydney             |$90,000    |
  |Hyundai       |Accent          |NSW-Sydney             |$7,500     |

@author_Jigna @Sanity
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Used’ link
    Then I navigate to ‘Used Cars For Sale’ page
    And I select make “<make>”
    And I select model “<model>”
    And I select location “<location>”
    And I select price “<price>”
    And I click on Find My Next Car tab
    Then I should see the make “<make>” in results
  Examples:
  |make               |model                        |location               |price            |
  |Isuzu              |Bellet                       |NSW-Hunter             |$10,000          |
  |Kia                |Carnival                     |NSW-Illawarra          |$15,000          |
  |Volkswagen         |Golf                         |NSW-Newcastle          |$45,000          |
  |Volkswagen         |Golf                         |NSW-Hunter             |$60,000          |
  |Mini               |Hatch                        |NT-All                 |$45,000          |
  |BMW                |M135i                        |NSW-Sydeny             |$90,000          |

@scenario_outline
Feature: Login tests with Scenario Outline

Scenario Outline: go to <module> and verify title: <title>
Given user is on the login page
When user logs in as "<user_type>"
And user navigates to "<tab>" and "<module>"
Then user verifies that page title is "<title>"

Examples:
| user_type      | tab           | module         | title                         |
| pos manager    | More          | Purchases      | Requests for Quotation - Odoo |
| pos manager    | More          | Inventory      | Inventory - Odoo              |
| pos manager    | Point of Sale | Orders         | Orders - Odoo                 |
| pos manager    | Point of Sale | Sessions       | Sessions - Odoo               |
| pos manager    | More          | Project        | Projects - Odoo               |
| pos manager    | More          | Maintenance    | Maintenance Teams - Odoo      |
| events manager | More          | Events         | Events - Odoo                 |
| events manager | More          | Repairs        | Repair Orders - Odoo          |
| events manager | More          | Employees      | Employees - Odoo              |
| events manager | More          | Leaves         | All - Contacts - Customers    |
| events manager | More          | Expenses       | My Expenses to Submit - Odoo  |
| events manager | More          | Maintenance    | Maintenance Teams - Odoo      |
| crm manager    | CRM           | Quotations     | Quotations - Odoo             |
| crm manager    | CRM           | Customers      | Customers - Odoo              |
| crm manager    | CRM           | Sales Channels | Sales Channels - Odoo         |
| crm manager    | CRM           | Activity Types | Activity Types - Odoo         |
| crm manager    | CRM           | Activities     | Activities Analysis - Odoo    |
| crm manager    | CRM           | Pipeline       | Pipeline Analysis - Odoo      |
Feature: Registering a Child

  Scenario: Successful register with full points
    Given The user opens the child registration form
    When enters the child's full name "a" , "b" , "c"
    And  sets child is disabled to "true"
    And  sets child has twin to "true"
    And  sets child has sibling to "true"
    And  sets child has one parent to "false"
    And  enters first parent's full name "a" , "b" , "c"
    And  enters first parent's email "mail"
    And  sets 	first parent is working to "true"
    And  enters second parent's full name "a" , "b" , "c"
    And  enters second parent's email "mail"
    And  sets 	second parent is working to "true"
    And  presses the submit button
    Then sees the message "6"
    
  Scenario: Successful register with one parent
    Given The user opens the child registration form
    When enters the child's full name "a" , "b" , "c"
    And  sets child is disabled to "true"
    And  sets child has twin to "true"
    And  sets child has sibling to "true"
    And  sets child has one parent to "true"
    And  enters first parent's full name "a" , "b" , "c"
    And  enters first parent's email "mail"
    And  sets 	first parent is working to "true"
    And  enters second parent's full name "" , "" , ""
    And  enters second parent's email ""
    And  sets 	second parent is working to ""
    And  presses the submit button
    Then sees the message "5"
    
  Scenario: Successful register with no dissabilities , twins and siblings ,but 2 working parents
    Given The user opens the child registration form
    When enters the child's full name "a" , "b" , "c"
    And  sets child is disabled to "false"
    And  sets child has twin to "false"
    And  sets child has sibling to "false"
    And  sets child has one parent to "false"
    And  enters first parent's full name "a" , "b" , "c"
    And  enters first parent's email "mail"
    And  sets 	first parent is working to "true"
    And  enters second parent's full name "a" , "b" , "c"
    And  enters second parent's email "mail"
    And  sets 	second parent is working to "true"
    And  presses the submit button
    Then sees the message "2"
    
  Scenario: Successful register with dissabilities , twin and sibling ,but 2 parents not working
    Given The user opens the child registration form
    When enters the child's full name "a" , "b" , "c"
    And  sets child is disabled to "true"
    And  sets child has twin to "true"
    And  sets child has sibling to "true"
    And  sets child has one parent to "false"
    And  enters first parent's full name "a" , "b" , "c"
    And  enters first parent's email "mail"
    And  sets 	first parent is working to "false"
    And  enters second parent's full name "a" , "b" , "c"
    And  enters second parent's email "mail"
    And  sets 	second parent is working to "false"
    And  presses the submit button
    Then sees the message "4"
      

   Scenario: Successful register with no child's first name
    Given The user opens the child registration form
    When enters the child's full name "" , "b" , "c"
    And  sets child is disabled to "true"
    And  sets child has twin to "true"
    And  sets child has sibling to "true"
    And  sets child has one parent to "false"
    And  enters first parent's full name "a" , "b" , "c"
    And  enters first parent's email "mail"
    And  sets 	first parent is working to "true"
    And  enters second parent's full name "a" , "b" , "c"
    And  enters second parent's email "mail"
    And  sets 	second parent is working to "true"
    And  presses the submit button
    Then sees the message "There are Empty Fields"
    
   Scenario: Successful register with no child's second name
    Given The user opens the child registration form
    When enters the child's full name "a" , "" , "c"
    And  sets child is disabled to "true"
    And  sets child has twin to "true"
    And  sets child has sibling to "true"
    And  sets child has one parent to "false"
    And  enters first parent's full name "a" , "b" , "c"
    And  enters first parent's email "mail"
    And  sets 	first parent is working to "true"
    And  enters second parent's full name "a" , "b" , "c"
    And  enters second parent's email "mail"
    And  sets 	second parent is working to "true"
    And  presses the submit button
    Then sees the message "There are Empty Fields"
    
    
   Scenario: Successful register with no child's last name
    Given The user opens the child registration form
    When enters the child's full name "a" , "b" , ""
    And  sets child is disabled to "true"
    And  sets child has twin to "true"
    And  sets child has sibling to "true"
    And  sets child has one parent to "false"
    And  enters first parent's full name "a" , "b" , "c"
    And  enters first parent's email "mail"
    And  sets 	first parent is working to "true"
    And  enters second parent's full name "a" , "b" , "c"
    And  enters second parent's email "mail"
    And  sets 	second parent is working to "true"
    And  presses the submit button
    Then sees the message "There are Empty Fields"
    
    
   Scenario: Successful register with no first parent's first name
    Given The user opens the child registration form
    When enters the child's full name "a" , "b" , "c"
    And  sets child is disabled to "true"
    And  sets child has twin to "true"
    And  sets child has sibling to "true"
    And  sets child has one parent to "false"
    And  enters first parent's full name "" , "b" , "c"
    And  enters first parent's email "mail"
    And  sets 	first parent is working to "true"
    And  enters second parent's full name "a" , "b" , "c"
    And  enters second parent's email "mail"
    And  sets 	second parent is working to "true"
    And  presses the submit button
    Then sees the message "There are Empty Fields"
    
   Scenario: Successful register with no first parent's second name
    Given The user opens the child registration form
    When enters the child's full name "a" , "b" , "c"
    And  sets child is disabled to "true"
    And  sets child has twin to "true"
    And  sets child has sibling to "true"
    And  sets child has one parent to "false"
    And  enters first parent's full name "a" , "" , "c"
    And  enters first parent's email "mail"
    And  sets 	first parent is working to "true"
    And  enters second parent's full name "a" , "b" , "c"
    And  enters second parent's email "mail"
    And  sets 	second parent is working to "true"
    And  presses the submit button
    Then sees the message "There are Empty Fields"
    
    
   Scenario: Successful register with no first parent's last name
    Given The user opens the child registration form
    When enters the child's full name "a" , "b" , "c"
    And  sets child is disabled to "true"
    And  sets child has twin to "true"
    And  sets child has sibling to "true"
    And  sets child has one parent to "false"
    And  enters first parent's full name "a" , "b" , ""
    And  enters first parent's email "mail"
    And  sets 	first parent is working to "true"
    And  enters second parent's full name "a" , "b" , "c"
    And  enters second parent's email "mail"
    And  sets 	second parent is working to "true"
    And  presses the submit button
    Then sees the message "There are Empty Fields"
    
  Scenario: Successful register with no second parent's first name
    Given The user opens the child registration form
    When enters the child's full name "a" , "b" , "c"
    And  sets child is disabled to "true"
    And  sets child has twin to "true"
    And  sets child has sibling to "true"
    And  sets child has one parent to "false"
    And  enters first parent's full name "a" , "b" , "c"
    And  enters first parent's email "mail"
    And  sets 	first parent is working to "true"
    And  enters second parent's full name "" , "b" , "c"
    And  enters second parent's email "mail"
    And  sets 	second parent is working to "true"
    And  presses the submit button
    Then sees the message "There are Empty Fields"
    
   Scenario: Successful register with no second parent's second name
    Given The user opens the child registration form
    When enters the child's full name "a" , "b" , "c"
    And  sets child is disabled to "true"
    And  sets child has twin to "true"
    And  sets child has sibling to "true"
    And  sets child has one parent to "false"
    And  enters first parent's full name "a" , "b" , "c"
    And  enters first parent's email "mail"
    And  sets 	first parent is working to "true"
    And  enters second parent's full name "a" , "" , "c"
    And  enters second parent's email "mail"
    And  sets 	second parent is working to "true"
    And  presses the submit button
    Then sees the message "There are Empty Fields"
    
    
   Scenario: Successful register with no second parent's last name
    Given The user opens the child registration form
    When enters the child's full name "a" , "b" , "c"
    And  sets child is disabled to "true"
    And  sets child has twin to "true"
    And  sets child has sibling to "true"
    And  sets child has one parent to "false"
    And  enters first parent's full name "a" , "b" , "c"
    And  enters first parent's email "mail"
    And  sets 	first parent is working to "true"
    And  enters second parent's full name "a" , "b" , ""
    And  enters second parent's email "mail"
    And  sets 	second parent is working to "true"
    And  presses the submit button
    Then sees the message "There are Empty Fields"
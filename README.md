## Check Protection
Project for CSC 221 - Software Design Lab at the City College of New York.
## About The Project
- An application that inputs a dollar amount to be printed on a check, then prints the amount in check-protected format with leading asterisks if necessary. Assume that nine spaces are available for printing the amount.
- Computers are frequently employed in check-writing systems, such as payroll and accounts payable applications. There are many strange stories about weekly paychecks being printed (by mistake) for amounts more than $1 million. Incorrect amounts are printed by computerized check-writing systems because of human error or machine failure. Systems designers build controls into their systems to prevent such erroneous checks from being issued.
- Another serious problem is the intentional alteration of a check amount by someone who plans to cash a check fraudulently. To prevent a dollar amount from being altered, some computerized check-writing systems employ a technique called check protection. Checks designed for imprinting by computer contain a fixed number of spaces in which the computer may print an amount. Suppose a paycheck contains eight blank spaces in which the computer is supposed to print the amount of aweekly paycheck. If the amount is large, then all eight of the spaces will be filled.
- For example,<br/>
1,230.60 (check amount)<br/>
12345678 (position numbers)<br/>
- On the other hand, If the amount is less than $1000, then several of the spaces would ordinarily be left blank.
- For example,<br/>
99.87<br/>
12345678
- Contains three blank spaces. If a check is printed with blank spaces, it’s easier for someone to alter the amount. To prevent alteration, many check-writing systems insert leading asterisks to protect the amount as follows:<br/>
***99.87<br/>
12345678
## Additional Information
- There are comments in the code that illustrates the thought process and exactly what each line of code is doing.
## Ask me about anything
If there are any questions, feel free to ask them [here](https://github.com/ChibiKev/Check-Protection/issues).
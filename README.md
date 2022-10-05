You are going shopping and you have prepared a grocery list.
Information about products is organized in an array of strings.
The format of each item is <product> <price per unit> <amount
to buy>. Any kind of separators can be used. The price per unit
and the amount to buy are integers.

You need to calculate the total price per product and the overall
amount that you are planning to spend. Return the result as
string without white spaces in the given format:

<price per product 1>+<price per product 2>+<price
per product N>=<total planned expenses>

If the format of an item is wrong, just skip it and move to the next
item. Don't forget to think through any corner cases.

Examples:

Input: [apples 5 1,oranges 6 1]
Output: 5+6=11

Input: [bread -1;1, milk - 2;1]
Output: 142=3

 

Input:[butter M N,milk 1 1]
Output: 1=1

Input: [cucumber - 2 10]
Output: 20=20

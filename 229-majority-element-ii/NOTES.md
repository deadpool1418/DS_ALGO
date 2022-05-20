Use Moore's algorithm to solve this problem. There can be two majority elements which appears more than N/3 times.
1. intialize num1=-1,num2=-1,c1=0;c2=0
2. check if num1 == ele then c1++
3. check if num2 == ele then c2++
4. check if c1==0 num1=ele c1=1
5. check if c2==0 num2=ele c2=1
6. else c1-- c2--
​
Keep track of both the elements.
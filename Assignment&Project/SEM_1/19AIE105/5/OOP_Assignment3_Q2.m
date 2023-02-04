x = [3 1 5 6 8];         
i = 1;  
while i <=5               
   j = i + 1;  
   while j <= 5           
       k = j + 1; 
       while k <=5 
           if x(1, i) + x(1, j) == x(1, k) 
             sum_of_first_two_element_is_third = [x(1, i) x(1, j) x(1, k)] 
           end           
           k = k + 1; 
       end 
       j = j + 1; 
   end 
   i = i + 1; 
end 

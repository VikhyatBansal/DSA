y= [];                            

for i=1:5 
    
   for j=i:(2*5-1)             

      if(i==j || i+j==2*5)        
                                  

           y(i,j)='*' ;         
                                  

      end 

   end 

end 

z=char(y);                       

w=flip(z);                       

disp(w);                          

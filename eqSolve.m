function [res]= eqSolve(char_input)
sym y(x) x
y(x)= char_input;
res=solve(y(x));
end 

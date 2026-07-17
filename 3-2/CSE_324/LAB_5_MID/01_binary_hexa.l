%{
#include <stdio.h>
#include <stdlib.h>
%}

%%
[0-1]+                  { printf("Binary: %s \n", yytext); }
[0-9A-Fa-f]+            { printf("Hexadecimal: %s \n", yytext); }
[ \t]                   { /* Ignore spaces and tabs */ } 
\n                      {  }
.                       { printf("Invalid Input: %s\n", yytext); }                   
%%

int yywrap() {
    return 1; 
}

int main() {
    printf("Enter input:\n");
    yylex();
    return 0;
}
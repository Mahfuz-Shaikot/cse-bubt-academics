%{
#include<stdio.h>
int ch=0; int li=0; int wo=0; int sp=0; int ta=0;
%}

%%
[a-zA-Z0-9]+   {wo++; ch += yyleng;}
[ \t]             {if(yytext[0]==' ') sp++; else ta++; ch++;}
. {ch++;} 
\n {li++; return 0;}                    
%%

int yywrap(){}

int main() {

printf("Enter Input: ");
yylex();
printf("Charecters Number: %d\n", ch);
printf("Line Number: %d\n", li);
printf("Word Number: %d\n", wo);
printf("Tab Number: %d\n", ta);
printf("Space Number: %d\n", sp);

return 0;
}
%{
#include<stdio.h>
%}

%%
    ^[a-zA-Z_][a-zA-Z_0-9]* {printf("%s is a valid identifier\n",yytext);}
    ^[^a-zA-Z_][a-zA-Z_0-9]* {printf("%s is not a valid identifier\n",yytext);}
    \n {return 0;}
%%

    int yywrap(){}
    int main()
{
    yylex();
    return 0;
}
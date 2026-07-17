%{
    #include<stdio.h>
%}

%%
    ^[a][^ab]* {printf("%s is not a valid identifier\n",yytext);}
    ^[^a][ab]* {printf("%s is not a valid identifier\n",yytext);}
    ^[a][ab]* {printf("%s is a valid identifier\n",yytext);}
    \n {return 0;}
%%

    int yywrap(){}
    int main()
{
    yylex();
    return 0;
}
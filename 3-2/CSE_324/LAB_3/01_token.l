%{
    #include <stdio.h>
    int valid = 1;
%}

%%

    "int"|"float"|"char"|"double"|"if"|"else"|"while"|"for"|"return" {printf("Keyword: %s\n", yytext);}
    [a-zA-Z_][a-zA-Z0-9_]* {printf("Identifier: %s\n", yytext);}
    [0-9]+ {printf("Integer: %s\n", yytext);}
    "+"|"-"|"*"|"/"|"=" {printf("Operator: %s\n", yytext);}
    ";"|","|"("|")"|"{"|"}" {printf("Symbol: %s\n", yytext);}
    [ \t\n]+   ;
    . {valid = 0; printf("Invalid: %s\n", yytext);}
%%

    int yywrap(){return 1;}

    int main()
{
    yylex();
    if(valid)
        printf("\nValid Token\n");
    else
    	printf("Invalid Token: %s\n", yytext);
    return 0;
}
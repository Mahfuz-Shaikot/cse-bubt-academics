%{
#include <stdio.h>
%}

%%
"int"|"float"|"if"|"else"|"for"|"while"    { printf("this is a keyword.\n"); }
[^ \t\n]+                                  { printf("this is not a keyword.\n"); }
[ \t\n]+                                   { /* Ignore whitespace, tabs, and newlines */ }
%%

int main() {
    printf("Enter a string:\n");
    yylex();
    return 0;
}

int yywrap() {
    return 1;
}
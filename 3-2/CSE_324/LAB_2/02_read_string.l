%{
#include <stdio.h>
%}

%%
^"//"[^\n]*\n            { printf("This is a comment.\n"); }
^"/*"[^\n]*"*/"\n        { printf("This is a comment.\n"); }
[^\n]*\n                 { printf("This is not a comment.\n"); }
%%

int main() {
    printf("Enter a string:\n");
    yylex();
    return 0;
}

int yywrap() {
    return 1;
}
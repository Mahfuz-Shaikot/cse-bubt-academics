%{
#include <stdio.h>
#include <stdlib.h>
%}

%%

(32\/[0-9]{2}\/[0-9]{4})|([0-9]{2}\/13\/[0-9]{4})   { printf("%s -> InValid Date \n", yytext); }

29\/0?2\/2023                                       { printf("%s -> InValid Date \n", yytext); }

31\/0?4\/(19[0-9]{2}|20[0-9]{2})                    { printf("%s -> InValid Date \n", yytext); }

(0?[1-9]|[12][0-9]|3[01])\/0?1\/(19[0-9]{2}|20[0-9]{2}) { printf("%s -> Valid Date \n", yytext); }


\n      {  }
[ \t]   {  }
.       {  }
%%

int yywrap() {
    return 1;
}

int main() {
    printf("Enter Input: \n");
    yylex();
    return 0;
}
%{
#include <stdio.h>
#include <stdlib.h>
%}

%%

a       { return 'a'; }
b       { return 'b'; }

[ \t]   {  }

\n      { return 0; } 

.       { return yytext[0]; } 
%%

int yywrap()
{
    return 1;
}
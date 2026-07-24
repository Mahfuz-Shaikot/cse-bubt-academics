%{
#include <stdio.h>
#include <stdlib.h>

int yylex();
void yyerror(const char *s);
%}

%%

input : S
      {
          printf("Accepted\n");
      }
      ;

/* Grammar:
   S → aSb | ab
*/
S : 'a' S 'b'
  | 'a' 'b'
  ;

%%

int yylex()
{
    return getchar();
}


void yyerror(const char *s)
{
    printf("Rejected\n");
    exit(0);
}


int main()
{
    printf("Enter string: ");
    yyparse();
    return 0;
}

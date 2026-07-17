%{
#include <stdio.h>
#include <stdlib.h>

extern int yylex(void);

void yyerror(const char *s)
{
    fprintf(stderr, "Error: %s\n", s);
}
%}

%token ZERO ONE TWO THREE FOUR FIVE SIX SEVEN

%%

N : L
    {
        printf("\nDecimal Value: %d\n", $$);
    }
    ;

L : L B
    {
        $$ = $1 * 8 + $2;
    }
  | B
    {
        $$ = $1;
    }
    ;

B : ZERO  { $$ = 0; }
  | ONE   { $$ = 1; }
  | TWO   { $$ = 2; }
  | THREE { $$ = 3; }
  | FOUR  { $$ = 4; }
  | FIVE  { $$ = 5; }
  | SIX   { $$ = 6; }
  | SEVEN { $$ = 7; }
  ;

%%

int main()
{
    printf("Enter an octal number: ");
    return yyparse();
}
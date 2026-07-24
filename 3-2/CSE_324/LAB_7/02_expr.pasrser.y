%{
#include <stdio.h>
#include <stdlib.h>

extern int yylex(void);

void yyerror(const char *s){fprintf(stderr, "Error: %s\n", s);}

%}

%token ZERO ONE TWO THREE FOUR FIVE SIX SEVEN EIGHT NINE A S M D L R

%%

N : E
    {
        printf("\nValid Arithmetic Expression \n Value: %d\n", $$);
    }
    ;

E : E A E
    {
        $$ = $1 + $3;
    }
  | E S E
    {
        $$ = $1 - $3;
    }
  | E M E
    {
        $$ = $1 * $3;
    }
  | E D E
    {
        $$ = $1 / $3;
    }
  | L E R
    {
        $$ = $2;
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
  | EIGHT { $$ = 8; }
  | NINE  { $$ = 9; }
  ;

%%

int main()
{
    printf("Enter an octal number: ");
    return yyparse();
}
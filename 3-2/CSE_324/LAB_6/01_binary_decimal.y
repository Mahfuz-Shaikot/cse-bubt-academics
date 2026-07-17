%{
#include <stdio.h>
#include <stdlib.h>

extern int yylex(void);

void yyerror(const char *s) {
    fprintf(stderr, "Error: %s\n", s);
}
%}

%token ZERO ONE

%%
N : L   { printf("\nDecimal Value: %d\n", $1); }
  ;

L : L B { $$ = $1 * 2 + $2; }
  | B   { $$ = $1; }
  ;

B : ZERO { $$ = 0; }
  | ONE  { $$ = 1; }
  ;

%%

int main() {
    printf("Enter a binary sequence (e.g., 0101): ");
    return yyparse();
}

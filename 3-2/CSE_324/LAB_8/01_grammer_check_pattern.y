%{
#include <stdio.h>
#include <stdlib.h>

extern int yylex(void);

void yyerror(const char *s)
{
    printf("Rejected\n");
}
%}

%token A B

%%

S : a S b
  | a b
    ;

%%

int main()
{
    printf("Enter String: ");
    if(yyparse()==0){
        printf("Accepted\n");
    }
}
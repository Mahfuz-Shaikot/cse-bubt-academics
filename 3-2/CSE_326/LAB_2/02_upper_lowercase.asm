.MODEL SMALL
.STACK 100H

.DATA
    prompt_1 DB 'Uppercase Letter: $'
    prompt_2 DB 'Lowercase Letter: $'
    
.code

MAIN PROC 
    
    MOV AX, @DATA
    MOV DS, AX
    
    LEA DX, prompt_1
    MOV AH, 09H
    INT 21H    
    
    MOV AH, 01H
    INT 21H
    
    MOV BL, AL
    
    MOV AH, 02H
    INT 21H
    
    MOV DL, 13
    INT 21H
    MOV DL, 10
    INT 21H
    
    LEA DX, prompt_2
    MOV AH, 09H
    INT 21H
    
    ADD BL, 32
    MOV DL, BL 
    
    MOV AH, 02H
    INT 21H
    
    
MAIN ENDP
END MAIN
    
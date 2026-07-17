.MODEL SMALL
.STACK 100H

.DATA

    MSG_1 DB 'Enter a hex digit: $'
    MSG_2 DB 'Equivalent decimal value is: 1$'    

.CODE

MAIN PROC
    
    MOV AX, @DATA
    MOV DS, AX
    
    LEA DX, MSG_1
    MOV AH, 09H
    INT 21H  
    
    MOV AH, 01H
    INT 21H
    MOV BL, AL
    
    SUB BL, 17
    
    MOV AH, 02H
    
    MOV DL, 13
    INT 21H
    MOV DL, 10
    INT 21H
    
    LEA DX, MSG_2
    MOV AH, 09H
    INT 21H
    
    MOV DL, BL
    MOV AH, 02H
    INT 21H
    
    
MAIN ENDP
END MAIN
    
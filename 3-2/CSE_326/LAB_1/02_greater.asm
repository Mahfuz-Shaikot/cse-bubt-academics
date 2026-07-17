.MODEL SMALL
.STACK 100H

.DATA

    PROMPT_1 DB 'ENTER FIRST NUMBER: $'
    PROMPT_2 DB 'ENTER SECOND NUMBER: $' 
    PROMPT_3 DB 'GREATER NUMBER: $'
                                      

.CODE

MAIN PROC
    
    MOV AX, @DATA
    MOV DS, AX
    
    
    LEA DX, PROMPT_1
    MOV AH, 09H
    INT 21H 
    
    MOV AH, 01H
    INT 21H
    
    MOV BL, AL
    
    MOV AH, 02H
    
    MOV DL, 13
    INT 21H
    MOV DL, 10
    INT 21H
    
    LEA DX, PROMPT_2
    MOV AH, 09H
    INT 21H
    
    MOV AH, 01H
    INT 21H
    
    MOV CL, AL
    
    MOV AH, 02H
    
    MOV DL, 13
    INT 21H
    MOV DL, 10
    INT 21H
    
    LEA DX, PROMPT_3
    MOV AH, 09H
    INT 21H
    
    CMP BL, CL
    JG GRT_1
    JL GRT_2
    
    GRT_1:      MOV DL, BL
                MOV AH, 02H
                INT 21H
                JMP EXIT
   
    GRT_2:      MOV DL, CL
                MOV AH, 02H
                INT 21H
                JMP EXIT
    
    EXIT:
    
    
MAIN ENDP
END MAIN
                                         
#define segA1 2
#define segB1 3
#define segC1 4
#define segD1 5
#define segG1 6
#define segA2 7
#define segC2 8
#define segD2 9
#define segF2 10
#define segG2 11

int COUNT = 0;

void setup()
{
    for (int i = 2; i < 12; i++)
    {
        pinMode(i, OUTPUT);
    }
}
void loop()
{

    digitalWrite(segA1, HIGH);
    digitalWrite(segB1, HIGH);
    digitalWrite(segC1, HIGH);
    digitalWrite(segD1, HIGH);
    digitalWrite(segG1, HIGH);
    digitalWrite(segA2, HIGH);
    digitalWrite(segC2, HIGH);
    digitalWrite(segD2, HIGH);
    digitalWrite(segF2, HIGH);
    digitalWrite(segG2, HIGH);
}
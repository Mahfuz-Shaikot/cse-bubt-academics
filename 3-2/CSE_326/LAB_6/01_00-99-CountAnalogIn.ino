int D1[7] = { A3, A4, 11, 12, 13, A1, A2 };
int D2[7] = { 2, 3, 4, 5, 6, 7, 8 };

int S0[7] = { 1, 1, 1, 1, 1, 1, 0 };
int S1[7] = { 0, 1, 1, 0, 0, 0, 0 };
int S2[7] = { 1, 1, 0, 1, 1, 0, 1 };
int S3[7] = { 1, 1, 1, 1, 0, 0, 1 };
int S4[7] = { 0, 1, 1, 0, 0, 1, 1 };
int S5[7] = { 1, 0, 1, 1, 0, 1, 1 };
int S6[7] = { 1, 0, 1, 1, 1, 1, 1 };
int S7[7] = { 1, 1, 1, 0, 0, 0, 0 };
int S8[7] = { 1, 1, 1, 1, 1, 1, 1 };
int S9[7] = { 1, 1, 1, 1, 0, 1, 1 };

void setNum(int D[], int S[]) {
  for (int i = 0; i < 7; i++) {
    digitalWrite(D[i], S[i]);
  }
}

void setupPins() {
  for (int i = 0; i < 7; i++) {
    pinMode(D1[i], OUTPUT);
    pinMode(D2[i], OUTPUT);
  }
}

void clearPins() {
  for (int i = 0; i < 7; i++) {
    digitalWrite(D1[i], LOW);
    digitalWrite(D2[i], LOW);
  }
}

void allPins() {
  for (int i = 0; i < 7; i++) {
    digitalWrite(D1[i], HIGH);
    digitalWrite(D2[i], HIGH);
  }
}

void setup() {
  Serial.begin(9600);
  setupPins();
  Serial.println("Working...");
  clearPins();
}

const int glyphs[] = { S0, S1, S2, S3, S4, S5, S6, S7, S8, S9 };
int counter = 0;

void loop() {
  counter++;
  if (counter > 99) counter = 0;

  int first_digit = counter / 10;
  int second_digit = counter % 10;

  setNum(D1, glyphs[first_digit]);
  setNum(D2, glyphs[second_digit]);
  Serial.print(first_digit);
  Serial.println(second_digit);
  delay(250);
}
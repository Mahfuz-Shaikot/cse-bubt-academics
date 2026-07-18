# Lab 1: Basic Linux Terminal Operations

---

## 1. Display the path of your current directory

**Syntax:**

```bash
pwd
```

**Command Executed:**

```bash
pwd
```

**Terminal Log:**

```bash
00:44:22 ~/
$ pwd
/home/censxred

00:44:24 ~/
```

---

## 2. Create a new directory called `LabFiles` in your home directory

**Syntax:**

```bash
mkdir <directory_name>
```

**Command Executed:**

```bash
mkdir LabFiles
```

**Terminal Log:**

```bash
00:48:15 ~/
$ mkdir LabFiles
mkdir: created directory 'LabFiles'

00:48:23 ~/
$ ls
Desktop    Downloads    git      Music       Pictures    snap    Videos
Documents  fonts        LabFiles node_modules Public      Templates
```

---

## 3. Navigate into the `LabFiles` directory

**Syntax:**

```bash
cd <directory_name>
```

**Command Executed:**

```bash
cd LabFiles
```

**Terminal Log:**

```bash
00:50:44 ~/
$ ls
Desktop    Downloads    git      Music       Pictures    snap    Videos
Documents  fonts        LabFiles node_modules Public      Templates

00:50:47 ~/
$ cd LabFiles
/home/censxred/LabFiles

00:50:51 /home/censxred/LabFiles/
```

---

## 4. Create three new directories inside `LabFiles`

Directories:

- FileDir1
- FileDir2
- FileDir3

**Syntax:**

```bash
mkdir <directory1> <directory2> <directory3>
```

**Command Executed:**

```bash
mkdir FileDir1 FileDir2 FileDir3
```

**Terminal Log:**

```bash
00:52:32 /home/censxred/LabFiles/
$ mkdir FileDir1 FileDir2 FileDir3
mkdir: created directory 'FileDir1'
mkdir: created directory 'FileDir2'
mkdir: created directory 'FileDir3'

00:52:57 /home/censxred/LabFiles/
$ ls
FileDir1  FileDir2  FileDir3
```

---

## 5. Create three new files

Create:

- `file1.txt` inside `FileDir1`
- `file2.txt` inside `FileDir2`
- `file3.txt` inside `FileDir3`

**Syntax:**

```bash
touch <filename>
```

### FileDir1

```bash
00:55:12 /home/censxred/LabFiles/
$ cd FileDir1

/home/censxred/LabFiles/FileDir1

00:55:44 /home/censxred/LabFiles/FileDir1/
$ touch file1.txt

00:56:12 /home/censxred/LabFiles/FileDir1/
$ ls
file1.txt
```

### FileDir2

```bash
00:56:36 /home/censxred/LabFiles/FileDir1/
$ cd ..

00:56:38 /home/censxred/LabFiles/
$ cd FileDir2

/home/censxred/LabFiles/FileDir2

00:56:45 /home/censxred/LabFiles/FileDir2/
$ touch file2.txt

00:56:55 /home/censxred/LabFiles/FileDir2/
$ ls
file2.txt
```

### FileDir3

```bash
00:57:07 /home/censxred/LabFiles/FileDir2/
$ cd ..

00:57:09 /home/censxred/LabFiles/
$ cd FileDir3

/home/censxred/LabFiles/FileDir3

00:57:15 /home/censxred/LabFiles/FileDir3/
$ touch file3.txt

00:57:31 /home/censxred/LabFiles/FileDir3/
$ ls
file3.txt
```

---

## 6. List the files in `LabFiles`

**Syntax:**

```bash
ls
ls -la
```

**Commands Executed:**

```bash
ls
ls -la
```

**Terminal Log:**

```bash
01:07:17 /home/censxred/LabFiles/
$ ls
FileDir1  FileDir2  FileDir3

01:07:19 /home/censxred/LabFiles/
$ ls -la

total 0
drwxr-xr-x. 1 censxred censxred  48 Jul 29 00:52 .
drwx------. 1 censxred censxred 514 Jul 29 00:48 ..
drwxr-xr-x. 1 censxred censxred  18 Jul 29 00:56 FileDir1
drwxr-xr-x. 1 censxred censxred  18 Jul 29 00:56 FileDir2
drwxr-xr-x. 1 censxred censxred  18 Jul 29 00:57 FileDir3
```

---

## 7. Add contents to `file1.txt` and `file2.txt`

**Syntax:**

```bash
nano <filename>
```

### File 1 (`file1.txt`)

Contents:

```text
Hello there,
temporary components for file1.txt!
```

Command:

```bash
01:09:39 /home/censxred/LabFiles/FileDir1/
$ nano file1.txt
```

### File 2 (`file2.txt`)

Contents:

```text
Hello again,
temporary contents for file2.txt
```

Command:

```bash
01:13:35 /home/censxred/LabFiles/FileDir2/
$ nano file2.txt
```

---

## 8. Display the contents of `file1.txt`

**Syntax:**

```bash
cat <filename>
```

**Command Executed:**

```bash
cat file1.txt
```

**Terminal Log:**

```bash
01:16:41 /home/censxred/LabFiles/FileDir1/
$ cat file1.txt

Hello there,
temporary components for file1.txt!
```

---

## 9. Copy `file1.txt` as `backup.txt`

**Syntax:**

```bash
cp -rp <source> <destination>
```

**Command Executed:**

```bash
cp -rp file1.txt ~/LabFiles/backup.txt
```

**Terminal Log:**

```bash
01:18:40 /home/censxred/LabFiles/FileDir1/
$ cp -rp file1.txt ~/LabFiles/backup.txt
'file1.txt' -> '/home/censxred/LabFiles/backup.txt'

01:19:02 /home/censxred/LabFiles/FileDir1/
$ cd ..

01:19:06 /home/censxred/LabFiles/
$ ls
backup.txt  FileDir1  FileDir2  FileDir3

01:19:08 /home/censxred/LabFiles/
$ cat backup.txt

Hello there,
temporary components for file1.txt!
```

---

## 10. Rename `file2.txt` to `newfile.txt`

**Syntax:**

```bash
mv <old_name> <new_name>
```

**Command Executed:**

```bash
mv file2.txt newfile.txt
```

**Terminal Log:**

```bash
01:22:16 /home/censxred/LabFiles/FileDir2/
$ ls
file2.txt

01:22:16 /home/censxred/LabFiles/FileDir2/
$ mv file2.txt newfile.txt

renamed 'file2.txt' -> 'newfile.txt'

01:22:26 /home/censxred/LabFiles/FileDir2/
$ ls
newfile.txt
```

---

## 11. Move `newfile.txt` to `FileDir3` and rename it to `newfile2.txt`

**Syntax:**

```bash
mv <source> <destination>
```

**Command Executed:**

```bash
mv newfile.txt ~/LabFiles/FileDir3/newfile2.txt
```

**Terminal Log:**

```bash
01:27:00 /home/censxred/LabFiles/FileDir2/
$ mv newfile.txt ~/LabFiles/FileDir3/newfile2.txt

renamed 'newfile.txt' -> '/home/censxred/LabFiles/FileDir3/newfile2.txt'

01:27:20 /home/censxred/LabFiles/FileDir2/
$ cd ..

01:27:23 /home/censxred/LabFiles/
$ cd FileDir3

01:27:36 /home/censxred/LabFiles/FileDir3/
$ ls

file3.txt  newfile2.txt
```

---

## 12. Remove `file1.txt` from `FileDir1`

**Syntax:**

```bash
rm -rf <filename>
```

**Command Executed:**

```bash
rm -rf file1.txt
```

**Terminal Log:**

```bash
01:30:39 /home/censxred/LabFiles/FileDir1/
$ ls
file1.txt

01:30:39 /home/censxred/LabFiles/FileDir1/
$ rm -rf file1.txt

01:30:48 /home/censxred/LabFiles/FileDir1/
$ ls

# Directory is now empty
```

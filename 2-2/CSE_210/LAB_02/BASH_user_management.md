# Lab 2: Advanced Linux Terminal Operations, User Management, and Troubleshooting

---

# Additional Tasks

---

## 1. Concatenate `file1.txt` and `file2.txt` to create `file3.txt`

**Syntax:**
```bash
cat <file1> <file2> > <destination_file>
```

**Command Executed:**
```bash
cat file1.txt file2.txt > file3.txt
```

**Terminal Log:**
```bash
student@bubt-HP-ProDesk-600-G4-PCI-MT:~/lab2$ ls
file1.txt  file2.txt  file3.txt  'Lab 2 Task.pdf'

student@bubt-HP-ProDesk-600-G4-PCI-MT:~/lab2$ cat file1.txt
Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. Ut hendrerit semper vel class aptent taciti sociosqu. Ad litora torquent per conubia nostra inceptos himenaeos.

student@bubt-HP-ProDesk-600-G4-PCI-MT:~/lab2$ cat file2.txt
Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. Ut hendrerit semper vel class aptent taciti sociosqu. Ad litora torquent per conubia nostra inceptos himenaeos.

student@bubt-HP-ProDesk-600-G4-PCI-MT:~/lab2$ cat file1.txt file2.txt > file3.txt

student@bubt-HP-ProDesk-600-G4-PCI-MT:~/lab2$ cat file3.txt
Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. Ut hendrerit semper vel class aptent taciti sociosqu. Ad litora torquent per conubia nostra inceptos himenaeos.

Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. Ut hendrerit semper vel class aptent taciti sociosqu. Ad litora torquent per conubia nostra inceptos himenaeos.
```

---

## 2. Show all running processes

**Syntax:**
```bash
ps
```

or

```bash
ps -ef
```

**Commands Executed:**
```bash
ps
ps -ef
```

**Terminal Log:**
```bash
student@bubt-HP-ProDesk-600-G4-PCI-MT:~$ ps

  PID TTY          TIME CMD
 9608 pts/0    00:00:00 bash
 9633 pts/0    00:00:00 ping
 9753 pts/0    00:00:00 ps
```

```bash
student@bubt-HP-ProDesk-600-G4-PCI-MT:~$ ps -ef

UID          PID    PPID  C STIME TTY          TIME CMD
root           1       0  0 08:23 ?        00:00:02 /sbin/init splash
root           2       0  0 08:23 ?        00:00:00 [kthreadd]
root           3       2  0 08:23 ?        00:00:00 [rcu_gp]
root           4       2  0 08:23 ?        00:00:00 [rcu_par_gp]
root           5       2  0 08:23 ?        00:00:00 [slub_flushwq]
root           6       2  0 08:23 ?        00:00:00 [netns]
root           8       2  0 08:23 ?        00:00:00 [kworker/0:0H-events_highpri]
root          10       2  0 08:23 ?        00:00:00 [mm_percpu_wq]
root          11       2  0 08:23 ?        00:00:00 [rcu_tasks_rude_]
root          12       2  0 08:23 ?        00:00:00 [rcu_tasks_trace]
root          13       2  0 08:23 ?        00:00:00 [ksoftirqd/0]
root          14       2  0 08:23 ?        00:00:14 [rcu_sched]
root          15       2  0 08:23 ?        00:00:00 [migration/0]
root          16       2  0 08:23 ?        00:00:00 [idle_inject/0]
root          18       2  0 08:23 ?        00:00:00 [cpuhp/0]
...
```

---

## 3. Ping `google.com`

**Syntax:**
```bash
ping <domain_or_ip>
```

**Command Executed:**
```bash
ping google.com
```

**Terminal Log:**
```bash
student@bubt-HP-ProDesk-600-G4-PCI-MT:~$ ping google.com

PING google.com (142.250.183.46) 56(84) bytes of data.

64 bytes from bom12s11-in-f14.1e100.net (142.250.183.46): icmp_seq=1 ttl=112 time=59.8 ms
64 bytes from bom12s11-in-f14.1e100.net (142.250.183.46): icmp_seq=2 ttl=112 time=59.6 ms
64 bytes from bom12s11-in-f14.1e100.net (142.250.183.46): icmp_seq=3 ttl=112 time=59.7 ms
64 bytes from bom12s11-in-f14.1e100.net (142.250.183.46): icmp_seq=4 ttl=112 time=59.6 ms
64 bytes from bom12s11-in-f14.1e100.net (142.250.183.46): icmp_seq=5 ttl=112 time=59.6 ms
64 bytes from bom12s11-in-f14.1e100.net (142.250.183.46): icmp_seq=6 ttl=112 time=59.5 ms
64 bytes from bom12s11-in-f14.1e100.net (142.250.183.46): icmp_seq=7 ttl=112 time=59.3 ms
64 bytes from bom12s11-in-f14.1e100.net (142.250.183.46): icmp_seq=8 ttl=112 time=59.5 ms
64 bytes from bom12s11-in-f14.1e100.net (142.250.183.46): icmp_seq=9 ttl=112 time=59.5 ms

^Z
[1]+ Stopped ping google.com
```

---

# Lab Work

---

## 1. Troubleshooting – Identify the currently logged-in users

**Syntax:**
```bash
who
```

**Command Executed:**
```bash
who
```

**Terminal Log:**
```bash
student@bubt-HP-ProDesk-600-G4-PCI-MT:~/Lab2$ who

student  :0  2025-08-03 08:25 (:0)
```

---

# 2. User Management

## A. Create a new user named `developer1`

**Syntax:**
```bash
sudo useradd <username>
```

**Command Executed:**
```bash
sudo useradd developer1
```

**Terminal Log:**
```bash
10:20:10 ~/
$ sudo useradd developer1

[sudo] password for censxred:
```

---

## B. Set a password for the newly created user

**Syntax:**
```bash
sudo passwd <username>
```

**Command Executed:**
```bash
sudo passwd developer1
```

**Terminal Log:**
```bash
10:21:17 ~/
$ passwd developer1

passwd: You may not view or modify password information for developer1.

10:21:30 ~/
$ sudo passwd developer1

New password:
Retype new password:

passwd: password updated successfully
```

---

## C. Create a new group named `development`

**Syntax:**
```bash
sudo groupadd <group_name>
```

**Command Executed:**
```bash
sudo groupadd development
```

**Terminal Log:**
```bash
10:35:06 ~/
$ sudo groupadd development
```

---

## D. Add the user `developer1` to the `development` group

**Syntax:**
```bash
sudo usermod -aG <group_name> <username>
```

**Command Executed:**
```bash
sudo usermod -aG development developer1
```

**Terminal Log:**
```bash
10:41:21 ~/
$ sudo usermod -aG development developer1
```

---

## E. Check the group membership of `developer1`

**Syntax:**
```bash
groups <username>
```

**Command Executed:**
```bash
groups developer1
```

**Terminal Log:**
```bash
10:44:17 ~/
$ groups developer1

developer1 : developer1 development
```

## 3. File Permission Adjustment

---

### A. Create a directory named `project_files` in the home directory of `developer1`

**Syntax:**
```bash
sudo mkdir <directory_path>
```

**Command Executed:**
```bash
sudo mkdir /home/developer1/project_files
```

**Terminal Log:**
```bash
10:55:54 ~/
$ sudo mkdir /home/developer1/project_files

mkdir: cannot create directory '/home/developer1/project_files': No such file or directory
```

> **Note:** This issue is resolved in the **Conclusion & Troubleshooting Summary** section below.

---

### B. Change the ownership and group of the `project_files` directory

**Syntax:**
```bash
sudo chown <owner> <directory_path>
sudo chgrp <group> <directory_path>
```

**Commands Executed:**
```bash
sudo chown developer1 /home/developer1/project_files
sudo chgrp development /home/developer1/project_files
```

**Terminal Log:**
```bash
11:18:06 ~/
$ sudo chown developer1 /home/developer1/project_files

11:40:31 ~/
$ sudo chgrp development /home/developer1/project_files
```

---

### C. Ensure that only the owner (`developer1`) has full permissions

**Syntax:**
```bash
sudo chmod u=rwx,g=,o= <directory_path>
```

**Command Executed:**
```bash
sudo chmod u=rwx,g=,o= /home/developer1/project_files
```

**Terminal Log:**
```bash
11:41:34 ~/
$ sudo chmod u=rwx,g=,o= /home/developer1/project_files
```

**Permission Notes**

| Permission | Description |
|------------|-------------|
| `755` | Standard/default permissions |
| `700` | Owner has full access, Group and Others have no access |
| 1st Digit | Owner permissions |
| 2nd Digit | Group permissions |
| 3rd Digit | Others permissions |

---

# 4. Conclusion & Troubleshooting Summary

## Issue Encountered

While creating the directory:

```bash
sudo mkdir /home/developer1/project_files
```

the following error occurred:

```bash
mkdir: cannot create directory '/home/developer1/project_files': No such file or directory
```

---

## Investigation

### Check whether the user exists

**Command Executed**
```bash
getent passwd | grep 'developer'
```

**Terminal Log**
```bash
11:06:56 ~/
$ getent passwd | grep 'developer'

developer1:x:1001:1002::/home/developer1:/bin/sh
```

---

### Check whether the home directory exists

**Command Executed**
```bash
ls -ld /home/developer1
```

**Terminal Log**
```bash
11:07:10 ~/
$ ls -ld /home/developer1

ls: cannot access '/home/developer1': No such file or directory
```

---

## Analysis

The user account `developer1` was successfully created, but its corresponding home directory (`/home/developer1`) had not been created. As a result, the `project_files` directory could not be created inside a non-existent parent directory.

---

## Corrective Actions

### Create the missing home directory

```bash
11:14:12 ~/
$ sudo mkdir -p /home/developer1
```

---

### Assign ownership

```bash
11:16:31 ~/
$ sudo chown developer1:developer1 /home/developer1
```

---

### Create the project directory

```bash
11:17:11 ~/
$ sudo mkdir /home/developer1/project_files
```

---

### Typographical Error Encountered

```bash
11:17:25 ~/
$ sudo chowm developer1:developer1 /home/developer1/project_files/

sudo: chowm: command not found
```

Correct command:

```bash
11:17:53 ~/
$ sudo chown developer1:developer1 /home/developer1/project_files/
```

---

## Handling Pre-existing Lab Environment

During testing, the following errors occurred because the user and group already existed.

### Existing User

```bash
student@bubt-HP-ProDesk-600-G4-PCI-MT:~/Lab2$
sudo useradd developer1

useradd: user 'developer1' already exists
```

---

### Existing Group

```bash
student@bubt-HP-ProDesk-600-G4-PCI-MT:~/Lab2$
sudo groupadd development

groupadd: group 'development' already exists
```

---

## Cleanup Commands

### Remove the existing user

```bash
11:58:58 ~/
$ sudo userdel -r developer1

userdel: developer1 mail spool (/var/mail/developer1) not found
```

---

### Verify user removal

```bash
11:59:00 ~/
$ getent passwd | grep 'developer'
```

---

### Remove the existing group

```bash
11:59:47 ~/
$ sudo groupdel development
```

---

### Verify group removal

```bash
12:01:45 ~/
$ getent group | grep 'developm'
```

---

# 5. Verification & Confirmation

---

## A. Verify User Database

**Command Executed**
```bash
getent passwd | grep 'developer'
```

**Terminal Log**
```bash
11:06:56 ~/
$ getent passwd | grep 'developer'

developer1:x:1001:1002::/home/developer1:/bin/sh
```

---

## B. Verify Group Membership

**Command Executed**
```bash
groups developer1
```

**Terminal Log**
```bash
10:44:17 ~/
$ groups developer1

developer1 : developer1 development
```

---

## C. Verify Home Directory

**Command Executed**
```bash
ls -ld /home/developer1
```

**Terminal Log**
```bash
11:07:10 ~/
$ ls -ld /home/developer1

ls: cannot access '/home/developer1': No such file or directory
```

---

C:\Users\dpk>cd E:\Trainings\GitRepoSyncJava

C:\Users\dpk>e:

E:\Trainings\GitRepoSyncJava>git init
Initialized empty Git repository in E:/Trainings/GitRepoSyncJava/.git/

E:\Trainings\GitRepoSyncJava>git config --global user.name "deepak"

E:\Trainings\GitRepoSyncJava>git config --global user.email "deepak.chennoria@gm
ail.com"

E:\Trainings\GitRepoSyncJava>git clone https://github.com/DeepakChennoria/Seleni
umTraining.git
Cloning into 'SeleniumTraining'...
warning: You appear to have cloned an empty repository.

E:\Trainings\GitRepoSyncJava>git remote
E:\Trainings\GitRepoSyncJava>git remote -v
E:\Trainings\GitRepoSyncJava>git remote add origin https://github.com/DeepakChen
noria/SeleniumTraining.git

E:\Trainings\GitRepoSyncJava>git push -u origin master
Username for 'https://github.com': deepak
Password for 'https://deepak@github.com':
remote: Invalid username or password.
fatal: Authentication failed for 'https://github.com/DeepakChennoria/SeleniumTra
ining.git/'

E:\Trainings\GitRepoSyncJava>git push -u origin master
Username for 'https://github.com': deepak.chennoria@gmail.com
Password for 'https://deepak.chennoria@gmail.com@github.com':
Counting objects: 4, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (2/2), done.
Writing objects: 100% (4/4), 518 bytes | 0 bytes/s, done.
Total 4 (delta 0), reused 0 (delta 0)
To https://github.com/DeepakChennoria/SeleniumTraining.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.
E:\Trainings\GitRepoSyncJava>git pull
remote: Enumerating objects: 7, done.
remote: Counting objects: 100% (7/7), done.
remote: Compressing objects: 100% (2/2), done.
remote: Total 4 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (4/4), done.
From https://github.com/DeepakChennoria/SeleniumTraining
   6ffa726..365a389  master     -> origin/master
Updating 6ffa726..365a389
Fast-forward
 SeleniumTraining/Readme.md.txt | 23 +++++++++++++++++++++++
 1 file changed, 23 insertions(+)

E:\Trainings\GitRepoSyncJava>


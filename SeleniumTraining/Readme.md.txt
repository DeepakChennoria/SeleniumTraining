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
E:\Trainings\GitRepoSyncJava>git status
On branch master
Your branch is up-to-date with 'origin/master'.
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   SeleniumTraining/Readme.md.txt

no changes added to commit (use "git add" and/or "git commit -a")

E:\Trainings\GitRepoSyncJava>git add.
git: 'add.' is not a git command. See 'git --help'.

The most similar command is
        add

E:\Trainings\GitRepoSyncJava>git remote add origin
usage: git remote add [<options>] <name> <url>

    -f, --fetch           fetch the remote branches
    --tags                import all tags and associated objects when fetching
                          or do not fetch any tag at all (--no-tags)
    -t, --track <branch>  branch(es) to track
    -m, --master <branch>
                          master branch
    --mirror[=<push|fetch>]
                          set up remote as a mirror to push to or fetch from


E:\Trainings\GitRepoSyncJava>git add .

E:\Trainings\GitRepoSyncJava>git commit -m "updated file"
[master 098e905] updated file
 1 file changed, 12 insertions(+)

E:\Trainings\GitRepoSyncJava>git push
Username for 'https://github.com': deepak.chennoria@gmail.com
Password for 'https://deepak.chennoria@gmail.com@github.com':
Counting objects: 4, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (2/2), done.
Writing objects: 100% (4/4), 578 bytes | 0 bytes/s, done.
Total 4 (delta 1), reused 0 (delta 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/DeepakChennoria/SeleniumTraining.git
   365a389..098e905  master -> master


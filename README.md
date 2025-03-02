# sreeramjava
Git Commands 
1. Setup and Configuration
   Command	Description
   git --version	Check installed Git version.
   git config --global user.name "Your Name"	Set user name.
   git config --global user.email "your@email.com"	Set user email.
   git config --list	View global Git configurations.
2. Repository Initialization & Cloning
   Command	Description
   git init	Initialize a new Git repository in the current directory.
   git clone <repo_URL>	Clone a remote repository to your local machine.
3. Staging & Committing Changes
   Command	Description
   git status	Show the current status of files in the working directory.
   git add <file>	Stage a specific file for commit.
   git add .	Stage all modified and new files for commit.
   git commit -m "Commit message"	Commit staged files with a message.
   git commit --amend -m "New message"	Modify the last commit message.
4. Branching & Merging
   Command	Description
   git branch	List all branches.
   git branch <branch_name>	Create a new branch.
   git checkout <branch_name>	Switch to a different branch.
   git checkout -b <branch_name>	Create and switch to a new branch.
   git merge <branch_name>	Merge a branch into the current branch.
   git branch -d <branch_name>	Delete a branch.
5. Remote Repository Management
   Command	Description
   git remote -v	Show the remote repository URL.
   git remote add origin <repo_URL>	Link local repo to a remote repo.
   git push -u origin <branch_name>	Push a branch to a remote repo.
   git pull origin <branch_name>	Fetch and merge changes from the remote repository.
   git fetch	Download changes from the remote repository without merging.
6. Undoing Changes
   Command	Description
   git reset <file>	Unstage a file (before commit).
   git reset --hard HEAD	Reset the working directory to the last commit.
   git revert <commit_hash>	Create a new commit that undoes a previous commit.
7. Viewing History
   Command	Description
   git log	Show commit history.
   git log --oneline	Show commit history in one line per commit.
   git diff	Show changes between commits or unstaged changes.
8. Stashing Changes
   Command	Description
   git stash	Save uncommitted changes for later.
   git stash pop	Apply the latest stash and remove it from the stash list.
   git stash list	Show all stashed changes.
9. Tags
   Command	Description
   git tag	List all tags.
   git tag -a v1.0 -m "Version 1.0"	Create an annotated tag.
   git push origin --tags	Push tags to the remote repository.

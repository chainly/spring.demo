# spring
## eclipse

## mvn

## spring-boot

### init
- https://start.spring.io/
- or sts https://www.cnblogs.com/lsdb/p/9783435.html

### sync github
```
git init
git remote add origin git@github.com:chainly/spring.demo.git
# if github repo already has init commit 
git pull origin master --allow-unrelated-histories -X ours
# if merge conflict with exists file, we need to merge
git commit -m "add spring boot init"
git pull origin master --allow-unrelated-histories -X ours
# or https://docs.github.com/en/github/importing-your-projects-to-github/adding-an-existing-project-to-github-using-the-command-line
git branch --set-upstream-to=origin/master master
git push
```

### import

import from exist mvn project

### run
```
mvn install
mvn spring-boot:run
```

### step

1. hello

2. auth
# Configure Tomcat domain for that project

# Need a Tomcat 9 (not 10 - it's unsupported by Spring 5) in "/usr/local/opt/tomcat@9/libexec folder"
# for mac - this is a default place for Homebrew package manager after executing command:
# $ brew install tomcat@9

mkdir -p tomcat/{webapps,work,temp} logs src/main/webapp
ln -s /usr/local/opt/tomcat@9/libexec/bin tomcat/bin
ln -s /usr/local/opt/tomcat@9/libexec/lib tomcat/lib
ln -s /usr/local/opt/tomcat@9/libexec/webapps/host-manager tomcat/webapps/host-manager
ln -s /usr/local/opt/tomcat@9/libexec/webapps/manager tomcat/webapps/manager
cp -r /usr/local/opt/tomcat@9/libexec/conf src/main
mv src/main/conf src/main/config
ln -s ../src/main/config tomcat/conf
ln -s ../logs tomcat/logs
cp -r /usr/local/opt/tomcat@9/libexec/webapps/ROOT/WEB-INF src/main/webapp
cp /usr/local/opt/tomcat@9/libexec/webapps/ROOT/favicon.ico src/main/webapp

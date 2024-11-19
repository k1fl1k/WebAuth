# **OAuth2 Authentication & Authorization in Spring Boot**

## **Project Overview**
This project demonstrates how to implement user authentication and authorization on a website using Spring Boot and OAuth2. 
The application integrates third-party OAuth providers like Google for secure user login.
Use tests if you want to check project work without joining Google Cloud.

## **Features**
- User login using OAuth2 (Google).
- Secure access to protected resources.
- Automatic user registration via OAuth provider.
- Role-based access control.

## **Technologies Used**
- **Java 21**
- **Spring Boot**
- **Spring Security**
- **OAuth2 Client**

## **Setup Instructions**

### **1. Clone the Repository**
```bash
git clone https://github.com/k1fl1k/WebAuth.git
cd WebAuth
```

### **2. Configure OAuth2 Credentials**
1. Go to [Google Cloud Console](https://console.cloud.google.com/).
2. Create a project and enable the **Google OAuth API**.
3. Configure the **OAuth consent screen** and create OAuth credentials.
4. Add the following redirect URI:
   ```
   http://localhost:8080/login/oauth2/code/google
   ```
5. Copy the `Client ID` and `Client Secret` values.

### **3. Update `application.properties`**
Replace placeholders with your Google OAuth2 credentials:

```properties
spring.security.oauth2.client.registration.google.client-id=your-google-client-id
spring.security.oauth2.client.registration.google.client-secret=your-google-client-secret
```

### **4. Build and Run the Application**
Use Maven to build and run the project:

```bash
mvn clean install
mvn spring-boot:run
```
The application will run on `http://localhost:8080`.
OR
```
mvn test
```

## **License**
This project is licensed under the MIT License.

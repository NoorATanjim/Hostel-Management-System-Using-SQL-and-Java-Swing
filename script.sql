USE [master]
GO
/****** Object:  Database [Hostel_Management_System]    Script Date: 9/22/2020 12:04:07 PM ******/
CREATE DATABASE [Hostel_Management_System]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Hostel_Management_System', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\Hostel_Management_System.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'Hostel_Management_System_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\Hostel_Management_System_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [Hostel_Management_System] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Hostel_Management_System].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Hostel_Management_System] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Hostel_Management_System] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Hostel_Management_System] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Hostel_Management_System] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Hostel_Management_System] SET ARITHABORT OFF 
GO
ALTER DATABASE [Hostel_Management_System] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [Hostel_Management_System] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Hostel_Management_System] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Hostel_Management_System] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Hostel_Management_System] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Hostel_Management_System] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Hostel_Management_System] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Hostel_Management_System] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Hostel_Management_System] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Hostel_Management_System] SET  DISABLE_BROKER 
GO
ALTER DATABASE [Hostel_Management_System] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Hostel_Management_System] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Hostel_Management_System] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Hostel_Management_System] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Hostel_Management_System] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Hostel_Management_System] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Hostel_Management_System] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Hostel_Management_System] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [Hostel_Management_System] SET  MULTI_USER 
GO
ALTER DATABASE [Hostel_Management_System] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Hostel_Management_System] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Hostel_Management_System] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Hostel_Management_System] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [Hostel_Management_System] SET DELAYED_DURABILITY = DISABLED 
GO
USE [Hostel_Management_System]
GO
/****** Object:  Table [dbo].[Admin]    Script Date: 9/22/2020 12:04:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Admin](
	[username] [varchar](20) NOT NULL,
	[password] [varchar](20) NOT NULL,
	[adminType] [varchar](20) NOT NULL,
	[EmployeeID] [varchar](20) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[EMPLOYEE]    Script Date: 9/22/2020 12:04:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[EMPLOYEE](
	[EmployeeSerial] [int] IDENTITY(1,1) NOT NULL,
	[EmployeeId] [varchar](20) NOT NULL,
	[Name] [varchar](30) NOT NULL,
	[FathersName] [varchar](30) NOT NULL,
	[MothersName] [varchar](30) NOT NULL,
	[Email] [varchar](30) NOT NULL,
	[ContactNo] [varchar](20) NOT NULL,
	[DateOfBirth] [varchar](40) NULL,
	[BloodGroup] [varchar](20) NOT NULL,
	[Address] [varchar](200) NOT NULL,
	[Post] [varchar](20) NOT NULL,
	[GuardianContactNo] [varchar](20) NOT NULL,
	[Salary] [int] NOT NULL,
	[Picture] [varbinary](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[EmployeeSerial] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[ContactNo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[EmployeeId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[Email] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Expense]    Script Date: 9/22/2020 12:04:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Expense](
	[ExpenseId] [varchar](20) NOT NULL,
	[ExpenseName] [varchar](20) NOT NULL,
	[Date] [varchar](40) NULL,
	[Amount] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ExpenseId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Meal]    Script Date: 9/22/2020 12:04:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Meal](
	[MealId] [int] IDENTITY(10000001,1) NOT NULL,
	[MemberId] [varchar](20) NOT NULL,
	[Mealtype] [varchar](20) NOT NULL,
	[NoOfMeal] [int] NULL,
	[date] [varchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[MealId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[MEMBER]    Script Date: 9/22/2020 12:04:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[MEMBER](
	[MemberSerial] [int] IDENTITY(1,1) NOT NULL,
	[MemberId] [varchar](20) NOT NULL,
	[Name] [varchar](30) NOT NULL,
	[FathersName] [varchar](30) NOT NULL,
	[MothersName] [varchar](30) NOT NULL,
	[Email] [varchar](30) NOT NULL,
	[ContactNo] [varchar](20) NOT NULL,
	[DateOfBirth] [varchar](20) NULL,
	[BloodGroup] [varchar](20) NOT NULL,
	[Address] [varchar](200) NOT NULL,
	[Profession] [varchar](20) NOT NULL,
	[GuardianContactNo] [varchar](20) NOT NULL,
	[SeatNo] [varchar](20) NOT NULL,
	[MealType] [varchar](40) NULL,
	[Picture] [varbinary](max) NULL,
	[Due] [int] NULL,
	[LastDueMonth] [varchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[MemberSerial] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[MemberId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[SeatNo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[ContactNo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[Email] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Package]    Script Date: 9/22/2020 12:04:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Package](
	[Ac] [int] NOT NULL,
	[NonAc] [int] NOT NULL,
	[B] [int] NOT NULL,
	[L] [int] NOT NULL,
	[D] [int] NOT NULL,
	[BL] [int] NOT NULL,
	[BD] [int] NOT NULL,
	[LD] [int] NOT NULL,
	[BLD] [int] NOT NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Payment]    Script Date: 9/22/2020 12:04:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Payment](
	[PaymentId] [varchar](20) NOT NULL,
	[MemberID] [varchar](20) NOT NULL,
	[Name] [varchar](20) NOT NULL,
	[DateAndTime] [varchar](30) NOT NULL,
	[AdminId] [varchar](30) NOT NULL,
	[Amount] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[PaymentId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Room]    Script Date: 9/22/2020 12:04:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Room](
	[RoomId] [varchar](20) NOT NULL,
	[BuildingNo] [varchar](20) NOT NULL,
	[Floor] [varchar](20) NOT NULL,
	[Type] [varchar](20) NOT NULL,
	[TotalBed] [int] NOT NULL,
	[EmptyBed] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[RoomId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Seat]    Script Date: 9/22/2020 12:04:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Seat](
	[SeatId] [varchar](20) NOT NULL,
	[RoomId] [varchar](20) NOT NULL,
	[IsEmpty] [int] NOT NULL,
	[MemberId] [varchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[SeatId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[SerialNo]    Script Date: 9/22/2020 12:04:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SerialNo](
	[MemberSerial] [int] NOT NULL,
	[EmployeeSerial] [int] NOT NULL,
	[PaymentSerial] [int] NULL,
	[VisitorSerial] [int] NULL,
	[ExpenseSerial] [int] NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Visitor]    Script Date: 9/22/2020 12:04:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Visitor](
	[VisitorId] [varchar](20) NOT NULL,
	[VisitorsName] [varchar](30) NOT NULL,
	[MemberId] [varchar](20) NOT NULL,
	[TimeIn] [varchar](40) NOT NULL,
	[TimeOut] [varchar](40) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[VisitorId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[Admin]  WITH CHECK ADD FOREIGN KEY([EmployeeID])
REFERENCES [dbo].[EMPLOYEE] ([EmployeeId])
GO
USE [master]
GO
ALTER DATABASE [Hostel_Management_System] SET  READ_WRITE 
GO

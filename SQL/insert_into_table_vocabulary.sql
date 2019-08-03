USE [LearnEnglish]
GO
/****** Object:  Table [dbo].[tb_vocabulary]    Script Date: 08/02/2019 21:44:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_vocabulary](
	[id_vocabulary] [int] IDENTITY(1,1) NOT NULL,
	[image_descript] [nvarchar](255) NULL,
	[short_descript] [nvarchar](255) NULL,
	[id_theme] [int] NOT NULL,
	[title] [nvarchar](255) NULL,
 CONSTRAINT [PK__tb_vocab__845EE3E069FBBC1F] PRIMARY KEY CLUSTERED 
(
	[id_vocabulary] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[tb_vocabulary] ON
INSERT [dbo].[tb_vocabulary] ([id_vocabulary], [image_descript], [short_descript], [id_theme], [title]) VALUES (1, N'tu-vung-chu-de-dung-cu-hoc-tap.jpg', NULL, 1, N'T? V?ng Ti?ng Anh D?ng C? H?c T?p')
INSERT [dbo].[tb_vocabulary] ([id_vocabulary], [image_descript], [short_descript], [id_theme], [title]) VALUES (2, N'tu-vung-chuyen-nganh-marketing.jpg', NULL, 1, N'T? V?ng Ti?ng Anh Ngành Maketting')
INSERT [dbo].[tb_vocabulary] ([id_vocabulary], [image_descript], [short_descript], [id_theme], [title]) VALUES (3, N'tu-vung-tieng-anh-nganh-y.jpg', NULL, 1, N'T? V?ng Nghành Y')
INSERT [dbo].[tb_vocabulary] ([id_vocabulary], [image_descript], [short_descript], [id_theme], [title]) VALUES (8, N'tu-vung-tieng-anh-the-thao.jpg', NULL, 1, N'T? V?ng Ti?ng Anh Ch? Ð? Th? Thao')
INSERT [dbo].[tb_vocabulary] ([id_vocabulary], [image_descript], [short_descript], [id_theme], [title]) VALUES (9, N'tu-vung-tieng-anh-chu-de-nha-cua-1554794234.jpg', NULL, 1, N'T? V?ng Ti?ng Anh Ch? Ð? V? Nhà C?a')
INSERT [dbo].[tb_vocabulary] ([id_vocabulary], [image_descript], [short_descript], [id_theme], [title]) VALUES (11, N'tu-vung-xuat-nhap-khau1-1550646606.jpg', NULL, 1, N'T? V?ng Ti?ng Anh Chuyên Ngành Xu?t Nh?p Kh?u')
SET IDENTITY_INSERT [dbo].[tb_vocabulary] OFF
/****** Object:  ForeignKey [FK65x8nkay8yfv66tv6xwf2irt9]    Script Date: 08/02/2019 21:44:48 ******/
ALTER TABLE [dbo].[tb_vocabulary]  WITH CHECK ADD  CONSTRAINT [FK65x8nkay8yfv66tv6xwf2irt9] FOREIGN KEY([id_theme])
REFERENCES [dbo].[Tb_Theme] ([id_theme])
GO
ALTER TABLE [dbo].[tb_vocabulary] CHECK CONSTRAINT [FK65x8nkay8yfv66tv6xwf2irt9]
GO
